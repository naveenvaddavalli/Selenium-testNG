pipeline {
    agent any

    tools {
        maven 'Maven -3.9.11'    // name of Maven tool installed in Jenkins (configure in Jenkins > Global Tool Config)
        jdk 'Java'        // name of JDK configured in Jenkins
    }
    triggers {
          githubPush() // Trigger build on GitHub push events only.
    }
    
    stages {
        stage('Checkout') {
            steps {
                  git branch: 'newbranchintelli',  // branch
                                    credentialsId: 'ff951900-7a73-4001-905d-cd0cf7b007f9',
                                    url: 'https://github.com/naveenvaddavalli/Selenium-testNG.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Archive Reports') {
            steps {
                junit '**/target/surefire-reports/*.xml' // collecting TestNG/JUnit XML reports
                archiveArtifacts artifacts: 'target/surefire-reports/**', fingerprint: true
            }
        }
    }
    post {
        always {
            echo 'This will always run after the stages are finished.'
        }
        success {
            echo 'This will run only if the pipeline succeeds with no failure.'
        }
        failure {
            echo 'This will run only if the pipeline fails.'
        }
    }
}



