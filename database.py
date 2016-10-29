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

import MySQLdb
from flask import Flask

app = Flask(__name__) #determines root path

# db = MySQLdb.connect(host = #using the server ip address
# 					user = #username
# 					password = #password
# 					db = "FTS")

#if app.route contains a value other than "/", like "/tuna" then we are
@app.route('/survey') #currently routes this function to homepage (this decorator maps routing function to the return value)
def surveyQuery(userInput = None, questNum = None, question = None, answer = None, date = None, quarter = None):

	##NOTE: does not include language changing
	cur = db.cursor()
	
	if (questNum != none): 
		cur.execute("SELECT questionNumber FROM FTS WHERE questionNumber = " + userInput)

	 	return result + "</p>"

	else if (question != None):

		cur.execute("SELECT question FROM FTS WHERE question = " + userInput)

	else if (answer != None):

		cur.execute("SELECT answer FROM FTS WHERE answer = " + userInput)

	else if (date != None):

		cur.execute("SELECT date FROM FTS WHERE date = " + userInput)

	else if (quarter != None):

		cur.execute("SELECT quarter FROM FTS WHERE quarter = " + userInput)

	

	result = "<p>" #store as an html script

	##will have to print this to the user interface
	for row in cur.fetchall():
 	    #store row in a variable for printing
 	    result = result + row +"<br>" ##NEED TO KNOW IF THE ROW IS A TYPE STRING OR NOT

 	return result + "</p>" #can return html code in the return statement

@app.route('/fieldagent')
def fAgentQuery(userInput = None, fieldAgentId = None, name = None, nativeLang = None):
	##NOTE: does not include Spoken Language

	cur = db.cursor()

	if (fieldAgentId != none): 
		cur.execute("SELECT fieldAgentId FROM FTS WHERE fieldAgentId = " + userInput)

	 	return result + "</p>"

	else if (question != None):

		cur.execute("SELECT name FROM FTS WHERE name = " + userInput)

	else if (answer != None):

		cur.execute("SELECT nativeLang FROM FTS WHERE nativeLang = " + userInput)

	else if (date != None):

		cur.execute("SELECT date FROM FTS WHERE date = " + userInput)


	result = "<p>" #store as an html script

	##will have to print this to the user interface
	for row in cur.fetchall():
 	    #store row in a variable for printing
 	    result = result + row +"<br>" ##NEED TO KNOW IF THE ROW IS A TYPE STRING OR NOT

 	return result + "</p>" #can return html code in the return statement

@app.route('/community')
def communQuery(userInput = None, communId = None, country = None, populatuon = None, avgIncome = None, city = None, state = None):

	cur = db.cursor()

	if (communId != none): 
		cur.execute("SELECT communId FROM FTS WHERE communId = " + userInput)

	 	return result + "</p>"

	else if (question != None):

		cur.execute("SELECT country FROM FTS WHERE country = " + userInput)

	else if (answer != None):

		cur.execute("SELECT populatuon FROM FTS WHERE populatuon = " + userInput)

	else if (date != None):

		cur.execute("SELECT avgIncome FROM FTS WHERE avgIncome = " + userInput)

	else if (date != None):

		cur.execute("SELECT city FROM FTS WHERE city = " + userInput)

	else if (date != None):

		cur.execute("SELECT state FROM FTS WHERE state = " + userInput)


	result = "<p>"

	for row in cur.fetchall():
 	    result = result + row +"<br>" ##NEED TO KNOW IF THE ROW IS A TYPE STRING OR NOT

 	return result + "</p>"

if __name__ == "__main__": #tests if the script is ran from the main file
	app.run(debug=True)

