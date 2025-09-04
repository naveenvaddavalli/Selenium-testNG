pipeline {
    agent any

    tools {
        maven 'Maven -3.9.11'    // name of Maven tool installed in Jenkins (configure in Jenkins > Global Tool Config)
        jdk 'Java'        // name of JDK configured in Jenkins
    }
    triggers {
        pollSCM('H/5 * * * *') // Polls the SCM every 5 minutes for changes
    }
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'push',
                    url: 'https://github.com/naveenvaddavalli/cypress_vscode.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Archive Reports') {
            steps {
                junit '**/target/surefire-reports/*.xml' // collect TestNG/JUnit XML reports
                archiveArtifacts artifacts: 'target/surefire-reports/**', fingerprint: true
            }
        }
    }
    post {
        always {
            echo 'This will always run after the stages are finished.'
        }
        success {
            echo 'This will run only if the pipeline succeeds.'
        }
        failure {
            echo 'This will run only if the pipeline fails.'
        }
    }
}



