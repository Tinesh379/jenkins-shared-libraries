def call(Map config) {
    
    git branch: config.branch, changelog: false, poll: false, url: config.url
}