plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "jaminsso"
include("app")
include("domain")
include("application")
include("adapter")
