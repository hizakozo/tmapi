import com.rohanprabhu.gradle.plugins.kdjooq.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.6.10"
	kotlin("plugin.spring") version "1.6.10"
	id("org.springframework.boot") version "2.6.4"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id("com.rohanprabhu.kotlin-dsl-jooq") version "0.4.6"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-webflux:2.6.3")
//	implementation("org.springframework.boot:spring-boot-starter-security:2.6.3")
	implementation("org.springframework.boot:spring-boot-devtools:2.6.3")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
	implementation("io.arrow-kt:arrow-core:1.0.1")
	implementation("io.arrow-kt:arrow-fx-coroutines:1.0.1")
	implementation("io.arrow-kt:arrow-fx-stm:1.0.1")
	compileOnly("org.projectlombok:lombok")
	runtimeOnly("mysql:mysql-connector-java")
	jooqGeneratorRuntime("mysql:mysql-connector-java")
	implementation("org.springframework.boot:spring-boot-starter-jooq:2.6.3")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("io.projectreactor:reactor-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

jooqGenerator {

	jooqEdition = com.rohanprabhu.gradle.plugins.kdjooq.JooqEdition.OpenSource
	jooqVersion = "3.14.0"
	attachToCompileJava = false

	configuration("primary", project.the<SourceSetContainer>()["main"]) {
		configuration = jooqCodegenConfiguration {
			jdbc {
				username = "root"
				password = "root"
				driver = "com.mysql.jdbc.Driver"
				url = "jdbc:mysql://localhost:3399/tmapi"
			}

			generator {
				name = "org.jooq.codegen.KotlinGenerator"
				target {
					directory = "${project.rootDir}/src/main/kotlin"
					packageName = "com.example.tmapi.driver.gen"
				}

				database {
					name = "org.jooq.meta.mysql.MySQLDatabase"
					inputSchema = "tmapi"
				}
			}
		}
	}
}
