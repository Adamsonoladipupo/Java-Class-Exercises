def get_riders_wages(delivery):
	if type(delivery) == str:
		raise TypeError ("Invalid string inputs, only integers allowed")
	if type(delivery) == float:
		raise TypeError ("Invalid float inputs, only integers allowed")
	if delivery < 0:
		raise ValueError ("Invalid inputs, only positive integers allowed")

	if delivery < 50:
		wages = delivery * 160 + 5000
	if delivery >=50 and  delivery <= 59:
		wages = delivery * 200 + 5000
	if delivery >=60 and  delivery <= 69:
		wages = delivery * 250 + 5000
	if delivery >= 70:
		wages = delivery * 500 + 5000
	return wages
