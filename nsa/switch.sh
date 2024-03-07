read -p "Enter a fruit: " fruit
case $fruit in
     "Apple") echo "Red";;
     "Mango") echo "Yellow";;
     *) echo "Not a fruit";;
esac