#include<iostream>

using namespace std;

int main()
{
	int casos_teste;
	int divisa_x, divisa_y;
	int ponto_x, ponto_y;


	while (true) {

		cin >> casos_teste;

		if (casos_teste == 0) {
			return true;
		}

		cin >> divisa_y;
		cin >> divisa_x;

		for (int i = 0; i < casos_teste; i++) {

			cin >> ponto_y;
			cin >> ponto_x;

			if (divisa_x == ponto_x || divisa_y == ponto_y) {
				cout << "divisa";
			}
			else {

				if (ponto_x > divisa_x) {
					cout << "N";
				}
				else {
					cout << "S";
				}

				if (ponto_y > divisa_y) {
					cout << "E";
				}

				else {
					cout << "O";
				}

			}

			cout << endl;
			
		}


	}
}