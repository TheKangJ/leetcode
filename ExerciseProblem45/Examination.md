## 1. 题目描述
 - 简单的加密算法：把字符串中的字符替换成另外的字符，只有对方知道如何替换就可以 解密。要求根据给定的加密方法和密文，得到原始消息。
 - 输入格式  第一个参数为输入密钥，第二个参数输入密文。
 - 输出格式  对输入的数据输出解密后的原始信息。
 - 输入样例 “eydbkmiqugjxlvtzpnwohracsf” “kifq oua zarxa suar bti yaagrj fa xtfgrj”
 - 输出样例“jump the fence when you seeing me coming”
 - 第一行的“eydbkmiqugjxlvtzpnwohracsf”相当于密钥，含义是a 对应e、b 对应y、c 对应
 d…。因此，只要把密文序列中的相应字符替换为对应后面的字符即可。即对于“kifq oua zarxa
 suar bti yaagrj fa xtfgrj”，把K替换成J，把i替换成u，把f替换成m，…。
## 2. 测试用例  
  1. 输入 “” “”  输出 “”；
  2. 输入“eydbkmiqugjxlvtzpnwohracsf” “Kifq oua zarxa suar bti yaagrj fa xtfgrj”.输出“Jump the fence when you seeing me coming”
  3. 输入“eydbkmiqugjxlvtzpnwohracsf” “G mgea fgryuarj bgruwrj” 输出“I like minsheng yinhang”;
  4. 输入”eydbkmiqugjxlvtzpnwohracsf“ ”W yovtrj fwr sgmm yovijjma sgou oua yotvfy tz zwoa“ 输出：”A strong man will struggle with the storms of fate“
  5. 输入“qwertyuiopasdfghjklzxcvbnm” “Ggzj epc ncyvc bpcy fig lcchyo zc vizhyo”。输出"Jump the fence when you seeing me coming";
  6. 输入“qwertyuiopasdfghjklzxcvbnm” “Zhylpcyo fhypkyo kyagky oghpgk”。输出“Minsheng yinhang anquan guihua”
  7. 输入”qwertyuiopasdfghjklzxcvbnm“ ”K lediyo zky bhss ledgoosc bhep epc leidzl in nkec“。输出”A strong man will struggle with the storms of fate“；
  8. 输入“zxcvbnmasdfghjklqwertyuiop” "Uygyttyr xi hfyumst jhv" 输出："Tomorrow is another day".
  9. 输入”zxcvbnmasdfghjklqwertyuiop“ "H iutyfl ghf rxpp iutwllps rxum ums iuytgi yk khus" 输出：”A strong man will struggle with the storms of fate“;
  10. 输入”zxcvbnmasdfghjklqwertyuiop“ ”Gxfimsfl vxfmhfl hfqwhf lwxmwh“。输出”Minsheng yinhang anquan guihua“;

