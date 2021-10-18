from flask import Flask, request
import pandas as pd
import py_eureka_client.eureka_client as eureka_client

rest_port = 8010
eureka_client.init(eureka_server="http://localhost:8761/eureka",
                   app_name="flask-service",
                   instance_port=rest_port)

app = Flask(__name__)

@app.route("/flask-service/hello", methods=['GET'])
def hello():
    return "Flask Service"

if __name__ == "__main__":
    app.run(host='0.0.0.0', port = rest_port)