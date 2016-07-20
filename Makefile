ifndef SWAGGER_CODEGEN_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_JAR)
endif

all: clean doc

clean:
	rm -rf doc

doc:
	bootprint openapi conf/api.yml doc/latest/api/

tools:
	npm install -g bootprint bootprint-openapi

tools-osx: tools
	brew install swagger-codegen

.PHONY: all clean doc tools tools-osx
