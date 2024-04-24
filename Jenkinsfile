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
    }

}