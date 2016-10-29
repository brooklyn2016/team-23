#what is the schema?
#what do we need to query (we qurery per request of the user)
	#what kind of questions would the user want answered


##To grant permission on the server side##
#GRANT ALL
#ON  *.*
#TO user@192.168.39.17  -- client ip address
#IDENTIFIED BY 'pwd';

##may have to do this##
# It's likely MySQL is bound to localhost. Assuming you're using a Linux machine:
# On your remote machine, edit /etc/mysql/my.cnf
# Find bind-address=127.0.0.1, edit it to bind-address=0.0.0.0, or just remove the line.
# Restart MySQL
# Read more: http://dev.mysql.com/doc/refman/5.1/en/server-options.html#option_mysqld_bind-address

#import MySQLdb
from flask import Flask

app = Flask(__name__) #determines root path

# db = MySQLdb.connect(host = #using the server ip address
# 					user = #username
# 					password = #password
# 					db = "FTS")


@app.route('/') #currently routes this function to homepage (this decorator maps routing function to the return value)
def test():

	return "this is the homepage" #can return html code in the return statement

#if app.route contains a value other than "/", like "/tuna" then we are

def surveyQuery(userInput = None, questNum = None, question = None, answer = None, date = None):
	cur = db.cursor()
	
	if (questNum != none): 
		cur.execute("SELECT questionNumber FROM FTS WHERE questionNumber = " + questNum)

		result = "<p>" #store as an html script
		##will have to print this to the user interface
		for row in cur.fetchall():
	 	    #store row in a variable for printing
	 	    result = result + row +"<br>"

	 	return result + "</p>"
	 	
	 else if (question != None):

	 	cur.execute("SELECT question FROM FTS WHERE ")

if __name__ == "__main__": #tests if the script is ran from the main file
	app.run(debug=True)

