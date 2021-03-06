package behavior_pattern.responsibility;

import cn.hutool.core.lang.Console;

/**
 * User: lanxinghua
 * Date: 2019/7/24 14:56
 * Desc:
 */
public class FileHandler extends Handler {

    @Override
    protected void log(String msg) {
        LevelEnum levelEnum = getLevel();
        Console.log("File::Log::"+ levelEnum.getName()+"::" + msg);
    }
}
