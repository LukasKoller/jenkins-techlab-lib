def call(String channel) {
    stage('Build') {
        steps {
            sh 'bundle install'
        }
    }
}