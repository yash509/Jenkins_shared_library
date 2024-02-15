def call() {
    sh 'trivy image yash5090/youtube:latest > trivyimage.txt'
}