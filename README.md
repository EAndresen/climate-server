# climate-server
REST API for storing climate date from an arduino and save it in AWS DynamoDB.

For using the service you need to add this values to your properties file.
* amazon.access.key = Key for the user.
* amazon.access.secret-key = The users secret key.
* amazon.region = Reegon where you have created your DynamoDB.
* amazon.end-point.url = URL to the DynamoDB root in AWS.

* auth.username = Basic auth Username
* auth.password = {noop} Basic auth Password
* auth.roles = Basic auth Roels
