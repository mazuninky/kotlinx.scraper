plugins {
    id("org.jetbrains.kotlin.multiplatform") version "1.3.60"
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }

        jvm {

        }
    }
}

repositories {
    mavenCentral()
    jcenter()
}
