pipeline {
    agent {
        label "java:17"
    }

    stages {
        stage("Compile") {
            steps {
                sh "./mvnw compileJava"
            }
        }

        stage("Unit test") {
            steps {
                sh "./mvnw test"
            }
        }
    }

}