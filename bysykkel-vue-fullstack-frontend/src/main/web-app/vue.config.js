module.exports = {
    outputDir: '../resources/public',
    devServer: {
        proxy: "http://localhost:8080",
        port: 3000
    }
};