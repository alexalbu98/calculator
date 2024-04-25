pipeline {
    agent {
        label "java:17"
    }

    triggers {
        pollSCM('* * * * *')
    }

    stages {
        stage("Compile") {
            steps {
                sh "./mvnw compile"
            }
        }

        stage("Unit test") {
            steps {
                sh "./mvnw test"
            }
        }

        stage("Verify Code") {
            steps {
                sh "./mvnw verify"
                publishHTML (target: [
                    reportDir: 'target/site/jacoco/',
                    reportFiles: 'index.html',
                    reportName: "JaCoCo Report"
                ])
            }
        }
    }

}