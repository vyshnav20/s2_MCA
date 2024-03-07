read -p "Enter a number: " n
no=$n
p=0
while [ $n -gt 0 ]
do
    ld=$(($n % 10))
    p=$(($p * 10 + $ld))
    n=$(($n / 10))
done
if [ $p -eq $no ]
then echo "Palindriome"
else echo "Not palindrome"
fi