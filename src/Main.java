public class Main {

    public static void main(String[] args) {

        Notes note = new Notes(1, "My Note");
        note.setContent("Это моя первая заметка");
        System.out.println(note);

        NotesMemento memento = note.createMemento();

        note.setContent("Здесь решила изменить свою заметку");
        System.out.println(note);


    //Отменить изменения
        note.restore(memento);
        System.out.println(note);
    }


}
