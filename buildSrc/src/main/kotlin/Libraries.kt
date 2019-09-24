object BuildPlugins {
    object Versions {
        const val detekt = "1.0.0-RC12"
        const val dokka = "0.9.18"
        const val dependency_management = "1.0.8.RELEASE"
        const val protobuf = "0.8.10"
        const val jarTest = "1.0.1"
        const val spring_boot = "2.1.8.RELEASE"
    }
    const val detekt = "io.gitlab.arturbosch.detekt"
    const val dokka = "org.jetbrains.dokka"
    const val dependency_management = "io.spring.dependency-management"
    const val spring_boot = "org.springframework.boot"

    // https://github.com/google/protobuf-gradle-plugin
    const val protobuf = "com.google.protobuf"
    const val avro = "com.commercehub.gradle.plugin.avro"
    const val jarTest = "com.github.hauner.jarTest"
}

object Versions {
    const val kotlin = "1.3.50"
    const val kotlinx_coroutines = "1.3.0"
    const val spring_boot = BuildPlugins.Versions.spring_boot
    const val resilience4j = "0.17.0"
    const val vavr = "0.10.0"
    const val netty = "4.1.36.Final"
    const val grpc = "1.23.0"
    const val protobuf = "3.8.0"
    const val krotoplus = "0.4.0"
    const val retrofit2 = "2.6.0"
    const val jasync_sql = "1.0.2"
    const val reactor = "3.2.9.RELEASE"
    const val jackson = "2.9.9"
    const val lettuce = "5.1.7.RELEASE"
    const val javers = "5.6.3"
    const val querydsl = "4.2.1"
    const val jooq = "3.11.11"
    const val kotlin_logging = "1.6.26"
    const val slf4j = "1.7.26"
    const val logback = "1.2.3"
    const val micrometer = "1.2.0"
    const val koin = "2.0.1"
    const val byte_buddy = "1.9.13"
    const val junit_jupiter = "5.5.1"
    const val junit_platform = "1.5.1"
    const val assertj_core = "3.12.2"
    const val mockk = "1.9.3"
    const val mockito = "2.28.2"
    const val testcontainers = "1.11.3"
}

object Libraries {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlin_stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val kotlin_test = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
    const val kotlin_test_junit5 = "org.jetbrains.kotlin:kotlin-test-junit5:${Versions.kotlin}"
    const val kotlinx_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinx_coroutines}"
    const val kotlinx_coroutines_jdk8 = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:${Versions.kotlinx_coroutines}"
    const val kotlinx_coroutines_reactor = "org.jetbrains.kotlinx:kotlinx-coroutines-reactor:${Versions.kotlinx_coroutines}"
    const val kotlinx_coroutines_rx2 = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:${Versions.kotlinx_coroutines}"
    const val kotlinx_coroutines_test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinx_coroutines}"
    // javax api
    const val activation_api = "javax.activation:javax.activation-api:1.2.0"
    const val annotation_api = "javax.annotation:javax.annotation-api:1.3.2"
    const val cache_api = "javax.cache:cache-api:1.1.1"
    const val javax_inject = "javax.inject:javax.inject:1"
    const val validation_api = "javax.validation:validation-api:2.0.1.Final"
    const val javax_servlet_api = "javax.servlet:javax.servlet-api:4.0.1"
    // Apache Commons
    const val commons_beanutils = "commons-beanutils:commons-beanutils:1.9.4"
    const val commons_compress = "org.apache.commons:commons-compress:1.18"
    const val commons_codec = "commons-codec:commons-codec:1.12"
    const val commons_collections4 = "org.apache.commons:commons-collections4:4.3"
    const val commons_csv = "org.apache.commons:commons-csv:1.7"
    const val commons_digest3 = "commons-digest:commons-digester3:3.2"
    const val commons_exec = "org.apache.commons:commons-exec:1.3"
    const val commons_io = "commons-io:commons-io:2.6"
    const val commons_lang3 = "org.apache.commons:commons-lang3:3.9"
    const val commons_logging = "commons-logging:commons-logging:1.2"
    const val commons_math3 = "org.apache.commons:commons-math3:3.6.1"
    const val commons_pool2 = "org.apache.commons:commons-pool2:2.6.2"
    const val commons_rng_simple = "org.apache.commons:commons-rng-simple:1.2"
    const val commons_rng_simpling = "org.apache.commons:commons-rng-simpling:1.2"
    const val commons_text = "org.apache.commons:commons-text:1.6"
    const val commons_validator = "commons-validator:commons-validator:1.6"
    // typesafe config
    const val typesafe_config = "com.typesafe:config:1.3.4"

    const val kotlin_logging = "io.github.microutils:kotlin-logging:${Versions.kotlin_logging}"
    const val slf4j_api = "org.slf4j:slf4j-api:${Versions.slf4j}"
    const val slf4j_simple = "org.slf4j:slf4j-simple:${Versions.slf4j}"
    const val slf4j_log4j12 = "org.slf4j:slf4j-log4j12:${Versions.slf4j}"
    const val jcl_over_slf4j = "org.slf4j:jcl-over-slf4j:${Versions.slf4j}"
    const val jul_to_slf4j = "org.slf4j:jul-to-slf4j:${Versions.slf4j}"
    const val log4j_over_slf4j = "org.slf4j:log4j-over-slf4j:${Versions.slf4j}"
    const val logback = "ch.qos.logback:logback-classic:${Versions.logback}"

    const val findbugs = "com.google.code.findbugs:jsr305:3.0.2"
    const val guava = "com.google.guava:guava:28.0-jre"
    const val joda_time = "joda-time:joda-time:2.10.2"
    const val joda_convert = "org.joda:joda-convert:2.2.1"
    const val fst = "de.ruedigermoeller:fst:2.57"
    const val kryo = "com.esotericsoftware:kryo:4.0.2"
    const val kryo_serializers = "de.javakaffee:kryo-serializers:0.45"
    // Resilience4j
    const val resilience4j_all = "io.github.resilience4j:resilience4j-all:${Versions.resilience4j}"
    const val resilience4j_annotations = "io.github.resilience4j:resilience4j-annotations:${Versions.resilience4j}"
    const val resilience4j_bulkhead = "io.github.resilience4j:resilience4j-bulkhead:${Versions.resilience4j}"
    const val resilience4j_circuitbreaker = "io.github.resilience4j:resilience4j-circuitbreaker:${Versions.resilience4j}"
    const val resilience4j_core = "io.github.resilience4j:resilience4j-core:${Versions.resilience4j}"
    const val resilience4j_kotlin = "io.github.resilience4j:resilience4j-kotlin:${Versions.resilience4j}"
    const val resilience4j_framework_common = "io.github.resilience4j:resilience4j-framework-common:${Versions.resilience4j}"
    const val resilience4j_micrometer = "io.github.resilience4j:resilience4j-micrometer:${Versions.resilience4j}"
    const val resilience4j_ratelimiter = "io.github.resilience4j:resilience4j-ratelimiter:${Versions.resilience4j}"
    const val resilience4j_reactor = "io.github.resilience4j:resilience4j-reactor:${Versions.resilience4j}"
    const val resilience4j_rxjava2 = "io.github.resilience4j:resilience4j-rxjava2:${Versions.resilience4j}"
    const val resilience4j_retry = "io.github.resilience4j:resilience4j-retry:${Versions.resilience4j}"
    const val resilience4j_spring = "io.github.resilience4j:resilience4j-spring:${Versions.resilience4j}"
    const val resilience4j_spring_boot2 = "io.github.resilience4j:resilience4j-spring-boot2:${Versions.resilience4j}"
    const val resilience4j_spring_boot_common = "io.github.resilience4j:resilience4j-spring-boot-common:${Versions.resilience4j}"

    // Vavr
    const val vavr = "io.vavr:vavr:${Versions.vavr}"
    const val vavr_jackson = "io.vavr:vavr-jackson:${Versions.vavr}"
    const val vavr_kotlin = "io.vavr:vavr-kotlin:${Versions.vavr}"
    const val vavr_match = "io.vavr:vavr-match:${Versions.vavr}"
    const val vavr_test = "io.vavr:vavr-test:${Versions.vavr}"

    // Netty
    const val netty_all = "io.netty:netty-all:${Versions.netty}"
    const val netty_common = "io.netty:netty-common:${Versions.netty}"
    const val netty_buffer = "io.netty:netty-buffer:${Versions.netty}"
    const val netty_codec = "io.netty:netty-codec:${Versions.netty}"
    const val netty_codec_dns = "io.netty:netty-codec-dns:${Versions.netty}"
    const val netty_codec_http = "io.netty:netty-codec-http:${Versions.netty}"
    const val netty_codec_http2 = "io.netty:netty-codec-http2:${Versions.netty}"
    const val netty_codec_socks = "io.netty:netty-codec-socks:${Versions.netty}"
    const val netty_handler = "io.netty:netty-handler:${Versions.netty}"
    const val netty_handler_proxy = "io.netty:netty-handler-proxy:${Versions.netty}"
    const val netty_resolver = "io.netty:netty-resolver:${Versions.netty}"
    const val netty_resolver_dns = "io.netty:netty-resolver-dns:${Versions.netty}"
    const val netty_transport = "io.netty:netty-transport:${Versions.netty}"
    const val netty_transport_native_epoll = "io.netty:netty-transport-native-epoll:${Versions.netty}"
    const val netty_transport_native_kqueue = "io.netty:netty-transport-native-kqueue:${Versions.netty}"

    // gRPC
    const val grpc_protobuf = "io.grpc:grpc-protobuf:${Versions.grpc}"
    const val grpc_stub = "io.grpc:grpc-stub:${Versions.grpc}"
    const val grpc_netty = "io.grpc:grpc-netty:${Versions.grpc}"
    const val grpc_netty_shaded = "io.grpc:grpc-netty-shaded:${Versions.grpc}"
    const val grpc_protoc_gen_grpc_java = "io.grpc:protoc-gen-grpc-java:${Versions.grpc}"
    const val grpc_testing = "io.grpc:grpc-testing:${Versions.grpc}"
    const val protobuf_protoc = "com.google.protobuf:protoc:${Versions.protobuf}"
    const val protobuf_java = "com.google.protobuf:protobuf-java:${Versions.protobuf}"
    const val protobuf_java_util = "com.google.protobuf:protobuf-java-util:${Versions.protobuf}"
    const val grpc_kotlin_gen = "io.rouz:grpc-kotlin-gen:0.1.1"

    // kroto-plus
    const val kroto_plus_coroutines = "com.github.marcoferrer.krotoplus:kroto-plus-coroutines:${Versions.krotoplus}"
    const val kroto_plus_message = "com.github.marcoferrer.krotoplus:kroto-plus-message:${Versions.krotoplus}"
    const val kroto_plus_protoc_gen_kroto_plus = "com.github.marcoferrer.krotoplus:protoc-gen-kroto-plus:${Versions.krotoplus}"
    const val kroto_plus_test = "com.github.marcoferrer.krotoplus:kroto-plus-test:${Versions.krotoplus}"
    const val kroto_plus_protoc_gen_grpc_coroutines = "com.github.marcoferrer.krotoplus:protoc-gen-grpc-coroutines:${Versions.krotoplus}"

    // HTTP
    const val async_http_client = "org.asynchttpclient:async-http-client:2.10.1"
    const val async_http_client_extras_retrofit2 = "org.asynchttpclient:async-http-client-extras-retrofit2:2.10.1"
    const val async_http_client_extras_rxjava2 = "org.asynchttpclient:async-http-client-extras-rxjava2:2.10.1"
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofit2}"
    const val retrofit2_adapter_java8 = "com.squareup.retrofit2:adapter-java8:${Versions.retrofit2}"
    const val retrofit2_adapter_rxjava2 = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit2}"
    const val retrofit2_converter_jackson = "com.squareup.retrofit2:converter-jackson:${Versions.retrofit2}"
    const val retrofit2_converter_protobuf = "com.squareup.retrofit2:converter-protobuf:${Versions.retrofit2}"
    const val retrofit2_converter_scalars = "com.squareup.retrofit2:converter-scalars:${Versions.retrofit2}"
    const val retrofit2_mock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit2}"
    const val okhttp3 = "com.squareup.okhttp3:okhttp:4.0.1"
    const val okhttp3_mockwebserver = "com.squareup.okhttp3:mockwebserver:4.0.1"
    const val fuel = "com.github.kittinunf.fuel:fuel:2.1.0"

    // Jackson
    const val jackson_annotations = "com.fasterxml.jackson.core:jackson-annotations:${Versions.jackson}"
    const val jackson_core = "com.fasterxml.jackson.core:jackson-core:${Versions.jackson}"
    const val jackson_databind = "com.fasterxml.jackson.core:jackson-databind:${Versions.jackson}"
    const val jackson_datatype_jsr310 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310:${Versions.jackson}"
    const val jackson_datatype_jsr353 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr353:${Versions.jackson}"
    const val jackson_datatype_jdk8 = "com.fasterxml.jackson.datatype:jackson-datatype-jdk8:${Versions.jackson}"
    const val jackson_datatype_joda = "com.fasterxml.jackson.datatype:jackson-datatype-joda:${Versions.jackson}"
    const val jackson_datatype_guava = "com.fasterxml.jackson.datatype:jackson-datatype-guava:${Versions.jackson}"
    const val jackson_dataformat_avro = "com.fasterxml.jackson.dataformat:jackson-dataformat-avro:${Versions.jackson}"
    const val jackson_dataformat_protobuf = "com.fasterxml.jackson.dataformat:jackson-dataformat-protobuf:${Versions.jackson}"
    const val jackson_dataformat_csv = "com.fasterxml.jackson.dataformat:jackson-dataformat-csv:${Versions.jackson}"
    const val jackson_dataformat_properties = "com.fasterxml.jackson.dataformat:jackson-dataformat-properties:${Versions.jackson}"
    const val jackson_dataformat_yaml = "com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:${Versions.jackson}"
    const val jackson_module_kotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:${Versions.jackson}"
    const val jackson_module_paranamer = "com.fasterxml.jackson.module:jackson-module-paranamer:${Versions.jackson}"
    const val jackson_module_parameter_names = "com.fasterxml.jackson.module:jackson-module-parameter-names:${Versions.jackson}"
    const val jackson_module_scala = "com.fasterxml.jackson.module:jackson-module-scala:${Versions.jackson}"
    const val jackson_module_afterburner = "com.fasterxml.jackson.module:jackson-module-afterburner:${Versions.jackson}"

    const val gson = "com.google.code.gson:gson:2.8.5"
    const val gson_jodatime_serialisers = "com.fatboyindustrial.gson-jodatime-serialisers:gson-jodatime-serialisers:1.7.1"
    const val msgpack_core = "org.msgpack:msgpack-core:0.8.17"
    const val msgpack_jackson = "org.msgpack:jackson-dataformat-msgpack:0.8.17"
    const val protostuff_core = "io.protostuff:protostuff-core:1.6.0"
    const val protostuff_runtime = "io.protostuff:protostuff-runtime:1.6.0"
    const val protostuff_collectionschema = "io.protostuff:protostuff-collectionschema:1.6.0"

    // jasync-sql
    const val jasync_common = "com.github.jasync-sql:jasync-common:${Versions.jasync_sql}"
    const val jasync_mysql = "com.github.jasync-sql:jasync-mysql:${Versions.jasync_sql}"
    const val jasync_r2dbc_mysql = "com.github.jasync-sql:jasync-r2dbc-mysql:${Versions.jasync_sql}"
    const val jasync_postgresql = "com.github.jasync-sql:jasync-postgresql:${Versions.jasync_sql}"

    // Compression
    const val snappy_java = "org.xerial.snappy:snappy-java:1.1.7.3"
    const val lz4_java = "org.lz4:lz4-java:1.6.0"

    // Cryptography
    const val jasypt = "org.jasypt:jasypt:1.9.3"
    // Reactor
    const val reactor_core = "io.projectreactor:reactor-core:${Versions.reactor}"
    const val reactor_test = "io.projectreactor:reactor-test:${Versions.reactor}"
    const val reactor_netty = "io.projectreactor.netty:reactor-netty:0.8.9.RELEASE"
    // RxJava
    const val rxjava = "io.reactivex:rxjava:1.3.8"
    const val rxjava2 = "io.reactivex.rxjava2:rxjava:2.2.10"
    const val rxkotlin = "io.reactivex.rxjava2:rxkotlin:2.3.0"

    // Metrics
    const val micrometer_core = "io.micrometer:micrometer-core:${Versions.micrometer}"
    const val micrometer_test = "io.micrometer:micrometer-test:${Versions.micrometer}"
    const val micrometer_registry = "io.micrometer:micrometer-registry:${Versions.micrometer}"
    const val micrometer_registry_prometheus = "io.micrometer:micrometer-registry-prometheus:${Versions.micrometer}"
    const val micrometer_registry_graphite = "io.micrometer:micrometer-registry-graphite:${Versions.micrometer}"
    const val micrometer_registry_jmx = "io.micrometer:micrometer-registry-jmx:${Versions.micrometer}"

    const val latencyUtils = "org.latencyutils:LatencyUtils:2.0.3"
    const val hdrHistogram = "org.hdrhistogram:HdrHistogram:2.1.11"

    // Redis
    const val lettuce_core = "io.lettuce:lettuce-core:${Versions.lettuce}"

    // Memcached
    const val folsom = "com.spotify:folsom:1.6.1"
    const val spymemcached = "net.spy:spymemcached:2.12.3"

    // Zipkin
    const val zipkin_brave = "io.zipkin.brave:brave:5.6.9"

    // Hibernate
    const val hibernate_jpa_2_1_api = "org.hibernate.javax.persistence:hibernate-jpa-2.1-api:1.0.2.Final"
    const val javassist = "org.javassist:javassist:3.25.0-GA"

    // Javers (https://javers.org - Java Audit library)
    const val javers_core = "org.javers:javers-core:${Versions.javers}"
    const val javers_spring = "org.javers:javers-spring:${Versions.javers}"
    const val javers_spring_jpa = "org.javers:javers-spring-jpa:${Versions.javers}"
    const val javers_spring_mongo = "org.javers:javers-spring-mongo:${Versions.javers}"
    const val javers_persistence_mongo = "org.javers:javers-persistence-mongo:${Versions.javers}"
    const val javers_persistence_sql = "org.javers:javers-persistence-sql:${Versions.javers}"
    const val javers_spring_boot_starter_sql = "org.javers:javers-spring-boot-starter-sql:${Versions.javers}"

    // Expression
    const val javax_el_api = "javax.el:javax.el-api:3.0.0"
    const val javax_el = "org.glassfish:javax.el:3.0.1-b11"
    const val querydsl_apt = "com.querydsl:querydsl-apt:${Versions.querydsl}"
    const val querydsl_jpa = "com.querydsl:querydsl-jpa:${Versions.querydsl}"

    const val hikaricp = "com.zaxxer:HikariCP:3.3.1"
    const val dbcp2 = "org.apache.commons:commons-dbcp2:2.6.0" // latest : 2.6.0, vitamin used 2.1.1
    const val tomcat_jdbc = "org.apache.tomcat:tomcat-jdbc:9.0.21"
    const val mysql_connector_java = "mysql:mysql-connector-java:8.0.16"
    const val mariadb_java_client = "org.mariadb.jdbc:mariadb-java-client:2.4.2"
    const val postgresql_driver = "org.postgresql:postgresql:42.2.6"
    const val h2 = "com.h2database:h2:1.4.197"
    const val hsqldb = "org.hsqldb:hsqldb:2.5.0"
    const val flyway_core = "org.flywaydb:flyway-core:5.2.4"
    const val log4jdbc_remix = "org.lazyluke:log4jdbc-remix:0.2.7"

    const val exposed = "org.jetbrains.exposed:exposed:0.16.2"

    // UUID Generator
    const val java_uuid_generator = "com.fasterxml.uuid:java-uuid-generator:3.2.0"
    const val uuid_creator = "com.github.f4b6a3:uuid-creator:1.3.9"

    const val dagger = "com.google.dagger:dagger:2.23.1"
    const val dagger_compiler = "com.google.dagger:dagger-compiler:2.23.1"
    const val koin_core = "org.koin:koin-core:${Versions.koin}"
    const val koin_core_ext = "org.koin:koin-core-ext:${Versions.koin}"
    const val koin_test = "org.koin:koin-test:${Versions.koin}"

    // CSV parsers
    const val univocity_parsers = "com.univocity:univocity-parsers:2.8.2"
    const val byte_buddy = "net.bytebuddy:byte-buddy:${Versions.byte_buddy}"
    const val byte_buddy_agent = "net.bytebuddy:byte-buddy-agent:${Versions.byte_buddy}"
    const val objenesis = "org.objenesis:objenesis:3.0.1"
    const val ow2_asm = "org.ow2.asm:asm:7.1"
    const val lombok = "org.projectlombok:lombok:1.18.8"

    const val junit_jupiter = "org.junit.jupiter:junit-jupiter:${Versions.junit_jupiter}"
    const val junit_jupiter_api = "org.junit.jupiter:junit-jupiter-api:${Versions.junit_jupiter}"
    const val junit_jupiter_engine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit_jupiter}"
    const val junit_jupiter_params = "org.junit.jupiter:junit-jupiter-params:${Versions.junit_jupiter}"
    const val junit_platform_commons = "org.junit.platform:junit-platform-commons:${Versions.junit_platform}"
    const val junit_platform_engine = "org.junit.platform:junit-platform-engine:${Versions.junit_platform}"
    const val junit_platform_runner = "org.junit.platform:junit-platform-runner:${Versions.junit_platform}"
    const val junit_platform_launcher = "org.junit.platform:junit-platform-launcher:${Versions.junit_platform}"
    const val junit_platform_suite_api = "org.junit.platform:junit-platform-suite-api:${Versions.junit_platform}"

    const val kluent = "org.amshove.kluent:kluent:1.49"
    const val assertj_core: String = "org.assertj:assertj-core:3.12.2"
    const val mockk: String = "io.mockk:mockk:${Versions.mockk}"
    const val mockito_core = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockito_junit_jupiter = "org.mockito:mockito-junit-jupiter:${Versions.mockito}"
    const val mockito_kotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:2.1.0"
    const val jmock_junit5 = "org.jmock:jmock-junit5:2.12.0"
    const val mockserver_netty = "org.mock-server:mockserver-netty:5.6.0"
    const val mockserver_client_java = "org.mock-server:mockserver-client-java:5.6.0"

    const val system_rules = "com.github.stefanbirkner:system-rules:1.19.0"
    const val jmh_core = "org.openjdk.jmh:jmh-core:1.21"
    const val jmh_generator_annprocess = "org.openjdk.jmh:jmh-generator-annprocess:1.21"

    const val testcontainers: String = "org.testcontainers:testcontainers:${Versions.testcontainers}"
    const val testcontainers_junit_jupiter: String = "org.testcontainers:junit-jupiter:${Versions.testcontainers}"
    const val testcontainers_mariadb: String = "org.testcontainers:mariadb:${Versions.testcontainers}"
    const val testcontainers_mysql: String = "org.testcontainers:mysql:${Versions.testcontainers}"
    const val testcontainers_postgresql: String = "org.testcontainers:postgresql:${Versions.testcontainers}"
    const val testcontainers_oracle_xe = "org.testcontainers:oracle-xe:${Versions.testcontainers}"
    const val testcontainers_kafka = "org.testcontainers:kafka:${Versions.testcontainers}"
    const val testcontainers_pulsar = "org.testcontainers:pulsar:${Versions.testcontainers}"
}