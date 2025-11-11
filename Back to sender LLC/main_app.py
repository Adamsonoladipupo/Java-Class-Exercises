from back_to_sender_LLC_function import get_riders_wages

user_input = int(input("Enter the total delivery made in a day: "))
riders_wages = get_riders_wages(user_input)
print(f"Total wages for today is: {riders_wages}")
