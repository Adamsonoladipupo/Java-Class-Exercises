from unittest import TestCase

from entities.CCCryptography import CCCryptography


class TestCCCryptography(TestCase):
    def test_char_to_int(self):
        cCCryptography = CCCryptography
        expected = cCCryptography.char_to_int(self, 'a')
        self.assertEqual(0, expected)

    def test_char_to_int_with_space(self):
        cCCryptography = CCCryptography
        expected = cCCryptography.char_to_int(self, ' ')
        self.assertEqual(' ', expected)

    def test_char_to_int_with_invalid_char(self):
        cCCryptography = CCCryptography
        self.assertRaises(ValueError, lambda: cCCryptography.char_to_int(self, '@'))

    def test_int_to_char_with_a_valid_input(self):
        cCCryptography = CCCryptography
        expected = cCCryptography.int_to_char(self, 4)
        self.assertEqual('e', expected)

    def test_int_to_char_with_32_as_space(self):
        cCCryptography = CCCryptography
        expected = cCCryptography.int_to_char(self, 32)
        self.assertEqual(' ', expected)

    def test_add_key_with_a_valid_inputs(self):
        cCCryptography = CCCryptography
        expected = cCCryptography.add_key(self, 20, 5)
        self.assertEqual(25, expected)

    def test_add_key_with_32_as_space(self):
        cCCryptography = CCCryptography
        expected = cCCryptography.add_key(self, 32, 5)
        self.assertEqual(' ', expected)

    def test_minus_key_with_a_valid_inputs(self):
        cCCryptography = CCCryptography
        expected = cCCryptography.minus_key(self, 20, 5)
        self.assertEqual(15, expected)

    def test_minus_key_with_32_as_space(self):
        cCCryptography = CCCryptography
        expected = cCCryptography.minus_key(self, 32, 5)
        self.assertEqual(' ', expected)

    def test_modulo_26_with_a_negative_number(self):
        cCCryptography = CCCryptography
        expected = cCCryptography.modulo_26(self, -26)
        self.assertEqual(0, expected)

    def test_modulo_26_with_32_as_space(self):
        cCCryptography = CCCryptography
        expected = cCCryptography.modulo_26(self, 32)
        self.assertEqual(' ', expected)

    def test_modulo_26_with_number_above_25(self):
        cCCryptography = CCCryptography
        expected = cCCryptography.modulo_26(self, 26)
        self.assertEqual(0, expected)

    def test_modulo_26_with_number_within_the_range_of_0_t0_25(self):
        cCCryptography = CCCryptography
        expected = cCCryptography.modulo_26(self, 25)
        self.assertEqual(25, expected)

    def test_encrypt_with_a_valid_inputs_and_key_5(self):
        cCCryptography = CCCryptography()
        expected = cCCryptography.encrypt( "i love programming", 5)
        self.assertEqual("n qtaj uwtlwfrrnsl", expected)