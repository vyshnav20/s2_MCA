sum()
{
    c=$(($1+$2))
    echo "Sum = " $c
}
read -p "Enter 2 numbers: " a b
sum $a $b