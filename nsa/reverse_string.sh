read -p "Enter a string: " s
l=${#s}
str=""
for i in $(seq $((l - 1)) -1 0)
do
    a=${s:i:1}
    str+="$a"
done
echo "Reversed word: " $str