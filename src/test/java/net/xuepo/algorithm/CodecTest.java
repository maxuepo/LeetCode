package net.xuepo.algorithm;

import net.xuepo.structure.TreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Created by xuepo on 2/19/17.
 */
public class CodecTest extends Codec{

    @Test
    public void deserializeTest() {
        String str01 = "1,2,3,4,5,6,7,8,null,null,null,null,null,null,null,null,null";
        TreeNode root01 = deserialize(str01);

        System.out.println("null? " + (root01 == null));
        String out01 = serialize(root01);

        System.out.println(out01);


    }

}
