def call(Map config = [:]) {

    def pom = readMavenPom file: 'pom.xml'

    nexusArtifactUploader artifacts: 
    [[artifactId: 'pom.artifactId', 
    classifier: '', 
    file: 'target/${pom.artficatId}.${pom.packaging}',
    type: 'pom.packaging']], 
    credentialsId: 'nexus', 
    groupId: 'pom.groupId', 
    nexusUrl: '192.168.1.101:8081', 
    nexusVersion: 'nexus3', 
    protocol: 'http', 
    repository: config.repository, 
    version: 'pom.version'
}