import java.util.Scanner;
class acm1
{
	struct skill{
	int b1, b2, b3;
};

bool better(skill A, skill B){
	if (A.b1 >= B.b1 && A.b2 >= B.b2 && A.b3 >= B.b3){
		if(A.b1 > B.b1 || A.b2 > B.b2 || A.b3 > B.b3) return true;
		else return false;
	}
	else return false;
}

bool isTop(skill A, skill B, skill C){
	if(better(A,B) && better(A, C)) return true;
	else return false;
}
int main(){
	ios_base::sync_with_stdio(false);
	int t;
	cin >> t;
	while(t--){
		skill A, B, C;
		cin >> A.b1 >> A.b2 >> A.b3;
		cin >> B.b1 >> B.b2 >> B.b3;
		cin >> C.b1 >> C.b2 >> C.b3;

		if((isTop(A, B, C) && (better(B, C) || better(C, B)))
			||(isTop(B, A, C) && (better(A, C) || better(C, A)))
			|| (isTop(C, B, A) && (better(A, B) || better(B, A)))) cout << "yes" << "\n";
		else cout << "no" << "\n";
		
	}
}
}