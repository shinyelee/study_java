package chapter2_2;

public class Polynomial2 {

	// ��ü���� ���α׷��ֿ��� ��ü�� "������"+"�޼���"��.
	// �����ʹ� ��ü�� ���� �Ӽ��� ǥ���ϸ�, �޼���� ��ü�� ���� �Ӽ��� ǥ���Ѵ�.
	
	// �����Ŵ� "���, ����, ũ��, �귣��" ���� ���� �Ӽ�(������)��
	// "�޸���, �����Ѵ�, �ڷ� ����" ���� ���� �Ӽ�(���)�� ������.
	// -> �ϳ��� ��(term)�� "���"�� "����"��� ���� �Ӽ���
	// "x�� ���� �ָ� �ڽ��� ���� ������ش�", "ȭ�鿡 ������ش�" ���� ����� ������.
	
	public char name;
	public Term2 [] terms;
	public int nTerms = 0; // ��ü�� ���� �Ӽ�(������)
	
	public void addTerm(int c, int e) { // ��ü�� ���� �Ӽ�(���)
		int index = findTerm(e);
		if(index != -1) {
			terms[index].coef += c;
		}
		else {
			int i = nTerms-1;
			while(i>=0 && terms[i].expo<e) {
				terms[i+1] = terms[i];
				i--;
			}
			terms[i+1] = new Term2();
			terms[i+1].coef = c;
			terms[i+1].expo = e;
			nTerms++;
		}
	}
	
	public int findTerm(int e) {
		for(int i=0; i<nTerms && terms[i].expo>=e; i++)
			if(terms[i].expo == e)
				return i;
		return -1;
	}
	
	public int calcPolynomial(int x) {
		int result = 0;
		for(int i=0; i<nTerms; i++)
			result += terms[i].calcTerm(x);
		return result;
	}
	
	public void printPolynomial() {
		for(int i=0; i<nTerms; i++) {
			terms[i].printTerm();
		System.out.print("+");
		}
		System.out.println();
	}
}