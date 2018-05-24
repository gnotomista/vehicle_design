function diagrammiImpiegoCambio ( tauT, tauP, Reff, nMax )


n = [800 nMax];
V0 = 2*pi/60 * n / tauP * Reff * 3.6;

figure('Name','Diagramma d''impiego del cambio','NumberTitle','off')
hold on
for i = 1 : length(tauT)
    
    V = V0 / tauT(i);
    plot(V,n);
    
end
axis([0 250 800-100 nMax+100])
ax = gca;
ax.XTick = 0:10:250;
ax.YTick = [800,1000:500:nMax];
xlabel('Velocità del veicolo [km/h]')
ylabel('Velocità del motore [rpm]')


end