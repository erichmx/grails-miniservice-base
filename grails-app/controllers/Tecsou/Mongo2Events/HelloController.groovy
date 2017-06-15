package Tecsou.Mongo2Events

class HelloController {

    def index() { 
        render text:"Hello ${new Date()}"
    }
}
