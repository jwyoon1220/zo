package ajjertv.main;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Bob implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd,

                             String commandLabel, final String[] args) {

        if (sender instanceof Player) {

            if (commandLabel.equalsIgnoreCase("Bob")) {

                Player player = (Player) sender;

                setZombieStats((LivingEntity) player.getWorld().spawnEntity(

                        player.getLocation(), EntityType.ZOMBIE));//좀비 소환



            }

        }



        return false;

    }



    public void setZombieStats(LivingEntity entity) {

        entity.setCustomName("Bob");

        entity.setMaxHealth(500.0);//최대 체력 설정

        entity.setHealth(500.0);//현재 체력 설정

        entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,

                1000000, 1));//포션 효과 설정
        entity.addPotionEffect(new PotionEffect(PotionEffectType.CONDUIT_POWER,

                1000000, 1));//포션 효과 설정

        entity.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));//헬멧 설정

        entity.getEquipment().setItemInHand(new ItemStack(Material.DIAMOND_AXE));//무기 설정

    }



    @EventHandler
    public void getZombieDead(EntityDeathEvent event) {

        if (event.getEntity().getCustomName() == "Bob") {

            event.getEntity()

                    .getWorld()

                    .dropItem(event.getEntity().getLocation(),

                            new ItemStack(Material.DIAMOND, 10));//드랍아이템 설정

        }



    }

}
