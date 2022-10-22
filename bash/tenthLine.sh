# Given a text file file.txt, print just the 10th line of the file.
# 1. If the file contains less than 10 lines, what should you output?
# NOTHING (WTF!! There is a unit test but we have to run to know what we should output :v. Anyway, empty might be the best option here)
# 2. There's at least three different solutions. Try to explore all possibilities.

# head -10 file.txt | tail -1

# Solution 2
awk "NR==10" file.txt

# Solution 3
sed -n '10p' file.txt
