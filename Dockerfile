FROM jamesdbloom/docker-java8-maven
EXPOSE 8181
WORKDIR /app
COPY . /app

RUN chmod a+x .shipped/build .shipped/run .shipped/test

RUN [".shipped/build"]
CMD .shipped/run
