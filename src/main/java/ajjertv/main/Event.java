package ajjertv.main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerQuitEvent;


public class Event implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        e.setJoinMessage(ChatColor.BLUE + "Who is Join");


    }

    @EventHandler
    public void onDead(PlayerDeathEvent e) {
        Player p = e.getPlayer();
        e.setDeathMessage(ChatColor.RED + "Death and Perish");
    }


    @EventHandler
    public void onEntityShootBow(EntityShootBowEvent e) {
        if(e.getEntity() instanceof Player) {
            Arrow arrow = (Arrow)e.getProjectile();

                arrow.setGravity(false);
                arrow.setDamage(20);
                arrow.setPierceLevel(4);



            }
        }


    @EventHandler
    public void onb(PlayerItemDamageEvent e) {
        e.setDamage(0);
    }

    @EventHandler
    public void onEntityShootBow1(EntityShootBowEvent e) {   //활을 누군가 발사했을 때
        if(e.getEntity() instanceof Player) {   //발사한 사람이 플레이어면서
            Arrow arrow = (Arrow)e.getProjectile();
            if(arrow.isCritical()) {    //활시위를 끝까지 당기고 발사했다면
                arrow.setGravity(false);    //중력의 영향 없음
                arrow.setDamage(100);        //피격시 100데미지
                arrow.setPierceLevel(4);    //관통 레벨


            }
        }
    }

    @EventHandler
    public void c(PlayerQuitEvent e) {
        e.setQuitMessage(ChatColor.BLUE + "Who is leave");
    }

    @EventHandler
    public void c1(PlayerLevelChangeEvent e) {
        e.getPlayer().sendMessage(ChatColor.AQUA + "Level up!");
        Player p = e.getPlayer();

    }


}




