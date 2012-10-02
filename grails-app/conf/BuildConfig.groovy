grails.servlet.version = "3.0" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.7
grails.project.source.level = 1.7
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.tomcat.nio = true

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()

        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
		mavenRepo "https://oss.sonatype.org/content/repositories/releases/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.20'
		
		/*
		def tomcatVersion = "7.0.28"
		build("org.apache.tomcat:tomcat-catalina-ant:$tomcatVersion") {
			transitive = false
		}
		build "org.apache.tomcat.embed:tomcat-embed-core:$tomcatVersion"
		build "org.apache.tomcat.embed:tomcat-embed-jasper:$tomcatVersion"
		build "org.apache.tomcat.embed:tomcat-embed-logging-log4j:$tomcatVersion"

		// needed for JSP compilation
		runtime "org.eclipse.jdt.core.compiler:ecj:3.6.2"

		build "org.grails:grails-plugin-tomcat:${grailsVersion}"
		*/
    }

    plugins {
        runtime ":hibernate:$grailsVersion"
        runtime ":jquery:1.7.2"
        runtime ":resources:1.1.6"

        // Uncomment these (or add new ones) to enable additional resources capabilities
        //runtime ":zipped-resources:1.0"
        //runtime ":cached-resources:1.0"
        //runtime ":yui-minify-resources:0.1.4"
		
		compile ":platform-core:1.0.M6"
		compile ":events-push:1.0.M3"

        /*
         * TOMCAT dependencies
         */
		
		build ":tomcat:$grailsVersion" // regular tomcat plugin
		
//		compile ":jetty:2.0.1"

        runtime ":database-migration:1.1"

        compile ':cache:1.0.0'
    }
}
