
rmdir bin

mkdir bin

javac -d bin/ src/com/empcrud/collections/*.java


echo "Jar creation started"

cd bin/

jar cvfm ../empcrud.jar  ../mymanifest.txt com/

echo "Jar creation completed"