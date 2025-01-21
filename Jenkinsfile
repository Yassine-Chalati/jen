pipeline {
  agent any
  stages {
    stage('Backend Compile Phase') {
      steps {
        sh '''cd car
export JAVA_HOME=/opt/java/jdk-21.0.5
mvn validate package

cd ..
cd client
export JAVA_HOME=/opt/java/jdk-21.0.5
mvn validate package

cd ..
cd gateway
export JAVA_HOME=/opt/java/jdk-21.0.5
mvn validate package'''
      }
    }

    stage('Backend Quality Code Test Phase') {
      steps {
        sh '''cd car
mvn validate sonar:sonar -e  -Dsonar.projectKey=HabitApp  -Dsonar.projectName=\'car\'  -Dsonar.host.url=http://77.37.86.136:9000  -Dsonar.token=sqp_24d7a14a618d9abc4d04b3fa5e1e7cb4812fa7d8

cd ..
cd client
mvn validate sonar:sonar -e  -Dsonar.projectKey=HabitApp  -Dsonar.projectName=\'client\'  -Dsonar.host.url=http://77.37.86.136:9000  -Dsonar.token=sqp_24d7a14a618d9abc4d04b3fa5e1e7cb4812fa7d8

cd ..
cd gateway
mvn validate sonar:sonar -e  -Dsonar.projectKey=HabitApp  -Dsonar.projectName=\'gateway\'  -Dsonar.host.url=http://77.37.86.136:9000  -Dsonar.token=sqp_24d7a14a618d9abc4d04b3fa5e1e7cb4812fa7d8
'''
      }
    }

    stage('Deploy') {
      steps {
        sh 'docker compose up -d'
      }
    }

  }
}