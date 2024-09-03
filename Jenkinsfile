pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Zealw/ai_evaluate.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'  // 如果使用 Maven
                // 或者
                // sh './gradlew build'  // 如果使用 Gradle
            }
        }
        stage('Deploy') {
            steps {
                sshagent(['zealssh']) {
                    sh '''
                        # 停止旧的后端服务
                        ssh user@47.100.69.147 "pkill java || true"

                        # 复制新的 JAR 文件到服务器
                        scp target/ai_evaluate.jar user@47.100.69.147:/path/to/backend/

                        # 启动新的后端服务
                        ssh user@47.100.69.147 "nohup java -jar /path/to/backend/ai_evaluate.jar > /dev/null 2>&1 &"
                    '''
                }
            }
        }
    }
}