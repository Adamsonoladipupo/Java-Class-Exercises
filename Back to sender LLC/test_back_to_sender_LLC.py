import unittest
from back_to_sender_LLC_function import get_riders_wages

class TestBackToSenderLLC(unittest.TestCase):
	def test_if_get_riders_wages_funtion_returns_the_correction_wages_for_delivery_values(self):
		expected_1 = 12200
		expected_2 = 16000
		
		actual_1 = get_riders_wages(45)
		actual_2 = get_riders_wages(55)
		
		self.assertEqual(actual_1, expected_1)
		self.assertEqual(actual_2, expected_2)

	def test_if_get_riders_wages_funtion_throws_error_for_strings_input(self):
		expect = "Invalid string inputs, only integers allowed"
		actual = "string"
		self.assertRaises(TypeError,get_riders_wages, "string")

	def test_if_get_riders_wages_funtion_throws_error_for_float_input(self):
		expect = "Invalid float inputs, only integers allowed"
		actual = 22.3
		self.assertRaises(TypeError,get_riders_wages, 22.3)

	def test_if_get_riders_wages_funtion_throws_error_for_negative_integer_input(self):
		expect = "Invalid float inputs, only integers allowed"
		actual = -5
		self.assertRaises(ValueError,get_riders_wages, -5)
		#get_riders_wages(-5)

