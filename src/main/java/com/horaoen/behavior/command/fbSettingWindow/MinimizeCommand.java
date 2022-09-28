package designpatterns.command;

//��С�������ࣺ����������
class MinimizeCommand extends Command {
	private WindowHandler whObj; //ά�ֶ���������ߵ�����
	
	public MinimizeCommand() {
		whObj = new WindowHandler();
	}
	
//����ִ�з�������������������ߵ�ҵ�񷽷�
	public void execute() {
		whObj.minimize();
	}
}