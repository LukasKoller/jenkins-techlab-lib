def call(String channel) {
    node {
        sh 'bundle install'
    }
}