all: clean run

day_01.jar: clean
	kotlinc day_01.kt -include-runtime -d day_01.jar

clean:
	rm -rf day_01.jar

day_01: day_01.jar
	java -jar day_01.jar < ../input/day_01.txt