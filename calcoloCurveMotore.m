function calcoloCurveMotore ( a, b, c )

rads2rpm = 60/(2*pi);

x = [a;b;c];

n = 800:10:6500;
P = polyval(1/1000*[x;0],n);
C = polyval(rads2rpm*x,n);

figure('Name','Curve motore','NumberTitle','off')
[axes,~,~]=plotyy(n,P,n,C);
axes(1).XLim = [500 7000];
axes(2).XLim = [500 7000];
axes(1).YLim = [10 1.05*max(P)];
axes(2).YLim = [150 1.05*max(C)];
axes(1).XTick = 0:500:8000;
axes(1).YTick = 0:10:1.05*max(P);
axes(2).YTick = 0:10:1.05*max(C);
set(axes(1),'Ygrid','on')
set(axes(2),'Ygrid','on')
xlabel(axes(1),'Velocità [rpm]')
ylabel(axes(1),'Potenza [kW]')
ylabel(axes(2),'Coppia [Nm]')


end
