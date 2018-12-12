import java.io.FileInputStream

import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFWorkbook

object Runner extends App {
  val xlsStream = new FileInputStream("input/label_to_db_name.XLS")
  val wb = new HSSFWorkbook(xlsStream)
  assert(wb != null)

  val sheet = wb.getSheetAt(0)
  val rowIter = sheet.iterator()
  var dbNames: List[String] = Nil
  while (rowIter.hasNext) {
    val curRow = rowIter.next()
    dbNames = dbNames :+ curRow.getCell(1).getStringCellValue
  }
  val res = dbNames.map(x => "'" + x + "'").mkString("(", ", ", ")")
  println(res)
}
