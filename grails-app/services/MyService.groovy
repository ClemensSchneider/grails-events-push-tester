import grails.events.Listener

class MyService {
	//will receive client events from 'saveTodo' topic
	@Listener(namespace='browser') 
	def saveTodo(Map data){
		log.info(data)
		data.moreData = "There we go...."
		event('savedTodo', data, {}) // will trigger registered browsers on 'savedTodo' topic
	}
}
