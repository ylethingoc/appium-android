package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.DefaultPage;
import pom.NotesPage;

public class C04_Can_Add_Remove_Note extends TestBase {

    private DefaultPage defaultPage = new DefaultPage();
    private NotesPage notesPage = new NotesPage();

    @Test(description = "Can add/remove note")
    public void C04() {
        // Open app
        defaultPage.clickOKButton();
        // Click Menu > Note then add a new note
        defaultPage.clickMenu();
        defaultPage.clickNotes();
        notesPage.clickAddButton();
        notesPage.addNewWord("house");
        notesPage.addNoteText("day la nha");
        notesPage.clickSaveButton();
        // Verify note is added correctly
        Assert.assertEquals("house", notesPage.getItemName());
        Assert.assertEquals("day la nha", notesPage.getNote());
        // Delete created note
        notesPage.clickDeleteIcon();
        // Menu > Notes
        defaultPage.clickMenu();
        defaultPage.clickNotes();
        // Verify the note is gone
        Assert.assertTrue(notesPage.isNoteDeleted());

    }
}
