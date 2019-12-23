package cn.littlemotor.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 771
 *给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * 示例 1:
 *
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 *
 * 示例 2:
 *
 * 输入: J = "z", S = "ZZ"
 * 输出: 0
 *
 * 注意:
 *
 *     S 和 J 最多含有50个字母。
 *      J 中的字符不重复。
 *
 *
 *      解题思路：通过hashmap映射每种石头的出现次数
 */
public class GemAndStone {
  public int numJewelsInStones(String J, String S) {
    int result = 0;
    Map<Byte, Integer> stoneMap = new HashMap<>();
    byte[] stones = S.getBytes();
    for (int i = 0; i < stones.length; i++){
      Integer times = stoneMap.get(stones[i]);
      times = times == null ? stoneMap.put(stones[i], 1) : stoneMap.put(stones[i], ++times);
    }
    byte[] gems = J.getBytes();
    for (int i = 0; i < gems.length; i++){
      if (stoneMap.get(gems[i]) != null){
        result += stoneMap.get(gems[i]);
      }
    }
    return result;
  }

}
