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
from flask import Flask, render_template, request, redirect

app = Flask(__name__) #determines root path

#using the server ip address
db = MySQLdb.connect(host = '127.0.0.1',
					user = 'root',
					passwd = 'clapon88',
					db = "FTS")

cur = db.cursor()

@app.route("/", methods=["GET","POST"])
def fts(fieldSelect = None):
	if(request.method == "POST"):
		if(request.form["button1"] == 'Question'):
			fieldSelect = 'Question'
			print(fieldSelect)
		elif(request.form["button1"] == 'Answer'):
			fieldSelect = 'Answer'
			print(fieldSelect)
		elif(request.form["button1"] == 'Data'):
			fieldSelect = 'Data'
			print(fieldSelect)
		elif(request.form["button1"] == 'Buisness Quarter'):
			fieldSelect = 'Buisness Quarter'
			print(fieldSelect)
	elif(request.method == "GET"):
		print("test1")
	return render_template('fts.html', fieldSelect = fieldSelect)


#if app.route contains a value other than "/", like "/tuna" then we are
@app.route('/survey', methods = ['POST']) #currently routes this function to homepage (this decorator maps routing function to the return value)
def surveyQuery(questNum = None, question = False, answer = False, date = False, quarter = False):

	##NOTE: does not include language changing
	userInput = request.args.get(fieldSelect)
	
	if (questNum != False): 
		cur.execute("SELECT questionNumber FROM FTS WHERE questionNumber = " + userInput)

	 	return result + "</p>"

	elif (question != False):

		cur.execute("SELECT question FROM FTS WHERE question = " + userInput)

	elif (answer != False):

		cur.execute("SELECT answer FROM FTS WHERE answer = " + userInput)

	elif (date != False):

		cur.execute("SELECT date FROM FTS WHERE date = " + userInput)

	elif (quarter != False):

		cur.execute("SELECT quarter FROM FTS WHERE quarter = " + userInput)

	

	result = "<p>" #store as an html script

	##will have to print this to the user interface
	for row in cur.fetchall():
 	    #store row in a variable for printing
 	    result = result + row +"<br>" ##NEED TO KNOW IF THE ROW IS A TYPE STRING OR NOT

 	return result + "</p>", redirect ('/') #can return html code in the return statement

# @app.route('/fieldagent', methods = ['POST'])
# def fAgentQuery( lname = False, fname = False, nativeLang = False):
# 	##NOTE: does not include Spoken Language

# 	userInput = request.form['userInput']

# 	if (lname != False):

# 		cur.execute("SELECT lname FROM FTS WHERE lname = " + userInput)

# 	elif (fname != False):

# 		cur.execute("SELECT fname FROM FTS WHERE fname = " + userInput)

# 	elif (nativeLang != False):

# 		cur.execute("SELECT 'native language' FROM FTS WHERE 'native language' = " + userInput)


# 	result = "<p>" #store as an html script

# 	##will have to print this to the user interface
# 	for row in cur.fetchall():
#  	    #store row in a variable for printing
#  	    result = result + row +"<br>" ##NEED TO KNOW IF THE ROW IS A TYPE STRING OR NOT

#  	return result + "</p>" #can return html code in the return statement

# @app.route('/community', methods = ['POST'])
# def communQuery(communId = False, country = False, populatuon = False, avgIncome = False, city = False, state = False):

# 	userInput = request.form['userInput']

# 	if (communId != False): 
# 		cur.execute("SELECT communId FROM FTS WHERE communId = " + userInput)

# 	 	return result + "</p>"

# 	elif (country != False):

# 		cur.execute("SELECT country FROM FTS WHERE country = " + userInput)

# 	elif (populatuon != False):

# 		cur.execute("SELECT populatuon FROM FTS WHERE populatuon = " + userInput)

# 	elif (avgIncome != False):

# 		cur.execute("SELECT avgIncome FROM FTS WHERE avgIncome = " + userInput)

# 	elif (city != False):

# 		cur.execute("SELECT city FROM FTS WHERE city = " + userInput)

# 	elif (state != False):

# 		cur.execute("SELECT state FROM FTS WHERE state = " + userInput)


# 	result = "<p>"

# 	for row in cur.fetchall():
#  	    result = result + row +"<br>" ##NEED TO KNOW IF THE ROW IS A TYPE STRING OR NOT

#  	return result + "</p>"


# #add functionality to read the user input

if __name__ == "__main__": #tests if the script is ran from the main file
	app.run(debug=True)

