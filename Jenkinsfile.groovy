node {

    stage('Preparation') { // for display purposes
        echo "Preparation"
    }
    stage('Checkout') {
        echo "Checkout"
    }
    stage('Build') {
        echo "Build"
    }
    stage('Archive') {
        echo "Archive"
    }
    stage('Deploy') {
        echo "Deploy is not yet implemented"
    }
}