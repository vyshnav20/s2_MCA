read -p "Enter a string: " s
l=${#s}
str=""
for i in $(seq $((l - 1)) -1 0)
do
    a=`expr substr ${s} $((i)) 1`
    echo $a
done
echo "Reversed word: " $str